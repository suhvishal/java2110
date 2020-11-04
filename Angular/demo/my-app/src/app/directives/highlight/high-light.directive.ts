import { Directive, ElementRef, HostBinding, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[appHighLight]'
})
export class HighLightDirective {

  @Input()
  private hoverColor:string = 'white';
 
  @HostBinding('style.backgroundColor')
  private bgColor: string = this.hoverColor;

  @HostListener('mouseover')
  public onMouseOver(){
    this.bgColor = this.hoverColor;
  }

  @HostListener('mouseout')
  public onMouseOut(){
    this.bgColor = 'white';
  }


  constructor(private eleRef: ElementRef ) { 
      //console.log('appHighLight directive is used..')
      //console.log('object of class HightLightDirective is created')
      //console.log('eleRef = ', eleRef)
      //eleRef.nativeElement.style.backgroundColor = this.appHighLight;

      // setTimeout(() => {
      //   this.bgColor = 'blue'
      // }, 7000);
     
  }

}
