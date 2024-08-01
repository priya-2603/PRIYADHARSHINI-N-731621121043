import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent {
Sum : number;
Sub : number;
constructor(private calc :CalculatorService) {
  this.Sum=calc.getAddition(10,29);
  this.Sub=calc.getSubtraction(10,29);
}
}
