import { Genre } from './genre.model';


export class Movie {

    constructor(
         
        public title: string,
        public genre: Genre,
        public numberInStock: number,
        public dailyRentalRate: number,
        public _id?: string  
    ){}
}