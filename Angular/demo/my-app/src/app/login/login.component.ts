import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private authService:AuthService, private router:Router) { }

  ngOnInit(): void {
  }

  handleLogin(loginForm:NgForm){
    // console.log('you clicked on login button...')
     console.log(loginForm.value)
    //console.log(loginForm.value)

    this.authService.login(loginForm.value)
          .subscribe(
            (response)=>{
                //console.log('login successful')
                //console.log(response)
                //store the token into local storage of browser
                localStorage.setItem('token', response)
                //navigate to movies page
                this.router.navigate(['/movies'])
            },
            (error)=>{
                console.log(error)
            }
          )
       
    
  }

}
