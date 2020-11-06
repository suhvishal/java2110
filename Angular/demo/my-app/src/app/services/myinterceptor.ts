import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from '@angular/common/http';
import { Observable } from 'rxjs';

export class MyInterceptor implements HttpInterceptor {
    

    intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
       

            //check if an authtoken is present in the localstorage 
            //add the token to the http header and then send the request 
            console.log('Interceptor executed.. adding custom header...')
           
            const token = localStorage.getItem('token');

            if(!token){
                return next.handle(req);
            }
            
            const newReq =  req.clone({
                setHeaders : {'x-auth-token' : token}
            })
           return next.handle(newReq);

    }

}