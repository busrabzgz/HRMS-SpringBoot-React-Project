import {Component, OnInit} from "@angular/core";

@Component({
  selector:"expense",
  templateUrl:"expense.component.html",
  styleUrls:["expense.component.css"]
})
export class ExpenseComponent implements OnInit{

  displayBasic = false;


  value2: any;

  ngOnInit(): void{


  }
  showBasicDialog() {
    this.displayBasic=!this.displayBasic;

  }



}
