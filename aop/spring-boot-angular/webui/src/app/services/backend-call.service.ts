import { Injectable } from '@angular/core';
import { Http, Headers, Response } from "@angular/http";
import { User } from '../user'

@Injectable({
  providedIn: 'root'
})
export class BackendCallService {
   API_URL="http://localhost:8080"

// const headers = new Headers({
    //   'Content-Type': 'application/jason;charset=UTF-8',
    //   'Access-Control-Allow-Origin' : '*'

    // });
  constructor(private http:Http) { }
  postCall(data:User){
    return  this.http.post(this.API_URL+"/login", data, {
      //   headers: headers
    })
  }
}
