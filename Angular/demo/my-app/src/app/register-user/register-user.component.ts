import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder, FormControl, FormGroup, ValidationErrors, Validators } from '@angular/forms';
import { MyValidators } from '../customvalidators/customvalidators.ts/customvalidators';

@Component({
  selector: 'app-register-user',
  templateUrl: './register-user.component.html',
  styleUrls: ['./register-user.component.css']
})
export class RegisterUserComponent implements OnInit {

  public userForm: FormGroup;


  public get email() {
    return this.userForm.get('email')
  }

  public get password() {
    return this.userForm.get('password')
  }

  constructor(private formBuilder: FormBuilder) {

    this.userForm = formBuilder.group({
      email: ['', [Validators.required, Validators.minLength(6)]],
      password: ['', [Validators.required, MyValidators.shouldNotContainSpaces]],
      name: ['', Validators.required]
    })

    // this.userForm = new FormGroup({
    //   username: new FormControl('', [Validators.required, Validators.minLength(6) ]),
    //   password: new FormControl('', [Validators.required, MyValidators.shouldNotContainSpaces]),
    //   name: new FormControl('', Validators.required)
    // })

  }




  handleSubmit() {
    console.log('form submitted...')
    console.log(this.userForm.value)
  }

  ngOnInit(): void {
  }

}
