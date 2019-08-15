import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Response } from "@angular/http";
import { User } from '../user'
import { Router } from '@angular/router';
import { BackendCallService } from '../services/backend-call.service';
import { StatusCheckService } from '../services/status-check.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  title = 'webui';
  @ViewChild('f') signinForm: NgForm

  user = {
    userName: "",
    pass: ""

  }

  constructor(private router: Router, private backendCall: BackendCallService,private status:StatusCheckService) { }

  ngOnInit() {
  }

  onSubmit() {
    this.user.userName = this.signinForm.value.userName;
    this.user.pass = this.signinForm.value.pass
    this.backendCall.postCall(this.user).subscribe((response: Response) => {
      const data: User = response.json();
      this.user.userName = data.pass
      if (response.status === 200) {
        this.status.subject.next(true)
        this.router.navigate(['/api'])
      }
    })

  }
}
