package guru.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import guru.springframework.controllers.examplebeans.FakeJmsBroker;
import guru.springframework.controllers.examplebeans.FakeSource;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
//@PropertySources({ @PropertySource("classpath:datasource.properties"), @PropertySource("classpath:jms.properties") })
public class PropertyConfig {
	@Value("${guru.user}")
	String user;
	@Value("${guru.password}")
	String pass;
	@Value("${guru.url}")
	String url;
	@Value("${guru.jms.user}")
	String jmsUser;
	@Value("${guru.jms.password}")
	String jmsPass;
	@Value("${guru.jms.url}")
	String jmsUrl;

	@Bean
	public FakeSource fakeSource() {
		FakeSource fs = new FakeSource();
		fs.setUser(user);
		fs.setPassword(pass);
		fs.setUrl(url);
		return fs;
	}

	@Bean
	public FakeJmsBroker fakeJmsBroker() {
		FakeJmsBroker fs = new FakeJmsBroker();
		fs.setUser(jmsUser);
		fs.setPassword(jmsPass);
		fs.setUrl(jmsUrl);
		return fs;
	}

//	@Bean
//	public static PropertySourcesPlaceholderConfigurer property() {
//		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//		return propertySourcesPlaceholderConfigurer;
//	}

}
