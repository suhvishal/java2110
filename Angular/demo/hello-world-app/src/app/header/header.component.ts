import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  public companyName:string = "Zycus"; 
  public imageUrl:string = "/assets/zycus-logo1.png";
  public isSpecial: boolean = true;

  public someStyles = {
    'font-style' : this.isSpecial ? 'italic' : 'normal',
    'font-weight' : this.isSpecial ? 'bold' : 'normal',
    'font-size' : this.isSpecial ? '24px' : '16px',
    'color' : this.isSpecial ? 'green' : 'black'
  }

  constructor() { 
    setTimeout(() => {
      //this.companyName = "Zycus Mumbai"
      //this.imageUrl = "/assets/zycus-logo2.png"
      this.isSpecial = false;
    }, 7000);
  }

  handleButtonClick(){
    console.log('Button is clicked....')
  }

  ngOnInit(): void {
  }

}
