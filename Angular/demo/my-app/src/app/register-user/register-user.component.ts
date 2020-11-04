import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-register-user',
  templateUrl: './register-user.component.html',
  styleUrls: ['./register-user.component.css']
})
export class RegisterUserComponent implements OnInit {

  private userForm: FormGroup;

  constructor() {

    this.userForm = new FormGroup({
      username: new FormControl(),
      password: new FormControl(),
      name: new FormControl()
    })

  }


  handleSubmit() {
    console.log('form submitted...')
    console.log(this.userForm)
  }

  ngOnInit(): void {
  }

}
