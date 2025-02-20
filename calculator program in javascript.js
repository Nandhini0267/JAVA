const op=prompt('Enter operator(either +,-,*or /):');
const num1=parseFloat(prompt('Enter first number'));
const num2=parseFloat(prompt('Enter second number'));
let calc;
if(op=='+'){
  calc=num1+num2;}
  else if(op=='-'){
    calc=num1-num2;
  }
  else if(op=='*'){
    calc=num1*num2;
  }
  else{calc=num1/num2;
}
console.log(calc);