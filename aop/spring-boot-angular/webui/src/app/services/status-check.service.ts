import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StatusCheckService {
  subject=new Subject<boolean>()

  constructor() { }
  initial(){
    this.subject.next(false)
  }
}
