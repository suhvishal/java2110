import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  handleLogin(loginForm:NgForm){
    // console.log('you clicked on login button...')
     console.log(loginForm.value)
    //console.log(loginForm.value)

       
    
  }

}
