import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  public companyName:string = "Zycus"; 
  public imageUrl:string = "/assets/zycus-logo1.png";

  constructor() { 
    setTimeout(() => {
      //this.companyName = "Zycus Mumbai"
      this.imageUrl = "/assets/zycus-logo2.png"
    }, 7000);
  }

  handleButtonClick(){
    console.log('Button is clicked....')
  }

  ngOnInit(): void {
  }

}
