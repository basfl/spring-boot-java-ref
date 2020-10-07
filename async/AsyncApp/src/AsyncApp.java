
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsyncApp {

    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {

//        CompletableFuture.supplyAsync(()->getId()).thenApplyAsync(id-> {
//            return id*2;
//        }
//        });
        CompletableFuture<String> cf = CompletableFuture.completedFuture(getMsg()).thenApplyAsync(s -> {

            sleepForLittle();
            return s.toUpperCase();

        });

        System.out.println("****************** result ->" + cf.join());
        System.out.println("should go ahead");
        CompletableFuture.supplyAsync(() -> getMsg()).thenAccept(result -> System.out.println("result is " + result));
        sleepForLittle();
        System.out.println("should done");
        readFileAsync();
    }

    private static void readFileAsync() throws IOException, InterruptedException, ExecutionException {
        String filePath = "C:\\Users\\jupit\\ide\\sts-workspaces\\async\\AsyncApp\\src\\test.txt";
        // printFileContents(filePath);
        Path path = Paths.get(filePath);
        System.out.println("*************" + path.toFile().getTotalSpace());
        System.out.println("*************" + path.toFile().length());
        AsynchronousFileChannel channel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);

        ByteBuffer buffer = ByteBuffer.allocate((int) path.toFile().length());

        Future result = channel.read(buffer, 0); // position = 0

        while (!result.isDone()) {

            System.out.println("Do something else while reading is in progress... ");
        }
        System.out.println("Reading done: " + result.isDone());
        System.out.println("Bytes read from file: " + result.get());

        buffer.flip();

        System.out.print("Buffer contents: ");

        while (buffer.hasRemaining()) {

            System.out.print((char) buffer.get());
        }
        System.out.println(" ");

        buffer.clear();
        channel.close();

    }

    public static String getMsg() {
        sleepForLittle();
        return "message";
    }

    private static void sleepForLittle() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
