import { core } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { Course } from '../model/course.model';

@Component({
  selector: 'app-courses-list',
  templateUrl: './courses-list.component.html',
  styleUrls: ['./courses-list.component.css']
})
export class CoursesListComponent implements OnInit {

  public ourCourses: Course[];

  constructor() {

      this.ourCourses = [
         new Course(1,  'Angular', '5 days', 'Vishal'),
         new Course(2,  'React', '5 days', 'Vishal'),
         new Course(3,  'Java', '7 days', 'Vishal'),
         new Course(4,  'Spring', '2 days', 'Vishal'),
         new Course(5,  'Hibernate', '6 days', 'Vishal'),
        ]

   }

  ngOnInit(): void {
  }

}
