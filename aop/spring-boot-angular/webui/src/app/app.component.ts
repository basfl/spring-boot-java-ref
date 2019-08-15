import { Component, OnInit } from '@angular/core';
import { StatusCheckService } from './services/status-check.service';




@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  implements OnInit{

  // user: User
  isSignin:boolean=false;
  constructor(private status:StatusCheckService) {
    this.status.subject.subscribe((data:boolean)=>{
      this.isSignin=data
      console.log("****",data)
    })
  }
  ngOnInit(){
    console.log("ngOn int")
   
  }
  signout() {
    this.isSignin = false
    console.log("out")
  }

}
