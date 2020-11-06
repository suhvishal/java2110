import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HighLightDirective } from './directives/highlight/high-light.directive';
import { LoginComponent } from './login/login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RegisterUserComponent } from './register-user/register-user.component';
import {HttpClientModule, HTTP_INTERCEPTORS} from '@angular/common/http';
import { MoviesListComponent } from './movies-list/movies-list.component';
import { MyInterceptor } from './services/myinterceptor';
import { NavbarComponent } from './navbar/navbar.component';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';


const appRoutes: Routes  = [
  {path : '', component: HomeComponent},
  {path : 'login', component: LoginComponent},
  {path : 'register', component: RegisterUserComponent},
  {path : 'movies', component: MoviesListComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HighLightDirective,
    LoginComponent,
    RegisterUserComponent,
    MoviesListComponent,
    NavbarComponent
  ],
  imports: [

  BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [
    {provide: HTTP_INTERCEPTORS, useClass: MyInterceptor, multi:true}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
