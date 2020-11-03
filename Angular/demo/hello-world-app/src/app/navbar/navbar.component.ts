import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  isActive: boolean = true;

  mybuttonStyle: string = 'btn btn-success active'

  constructor() { 

      setTimeout(() => {
        //this.isActive = false;
        this.mybuttonStyle = "btn btn-warning"
      }, 7000);

  }

  ngOnInit(): void {
  }

}
