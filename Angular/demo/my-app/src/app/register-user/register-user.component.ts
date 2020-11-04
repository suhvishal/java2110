import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-register-user',
  templateUrl: './register-user.component.html',
  styleUrls: ['./register-user.component.css']
})
export class RegisterUserComponent implements OnInit {

  private userForm: FormGroup;


  public get username(){
    return this.userForm.get('username')
  }

  constructor() {

    this.userForm = new FormGroup({
      username: new FormControl('', [Validators.required, Validators.minLength(6) ]),
      password: new FormControl('', Validators.required),
      name: new FormControl('vishal', Validators.required)
    })

  }


  handleSubmit() {
    console.log('form submitted...')
    console.log(this.userForm)
  }

  ngOnInit(): void {
  }

}
