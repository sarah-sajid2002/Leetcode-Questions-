/* memoization is an optimization technique that can be used to reduce time-consuming calculations by saving previous input to something called "cache" and retuning the result from it

asaan zaban main agar main na aik code likha or usko run kia or usko run hona main for example 24ms lagay ab agli br dubara code run hona main ya t itna hi ya km ya ziada time lagaga to is time ko save krna kalia hm is output ko cache main save krlaingay or wahin sa outpt lalaingay takay time save hojaye.
*/

// example code:

let sum = 0;
function getSum(n) {
  for (let index = 0; index <= n; index++) {
    sum += index;
  }
  return sum;
}
// console.time(); //this function is used to start the timer
// console.log(getSum(8));
// console.timeEnd(); //this is used to end teh timer

function effFunction(func) {
  let cache = {};
  return function (...args) {
    let n = args[0];
    if (n in cache) {
      console.log("cache");
      return n;
    } else {
      console.log("first time");
      let result = func(n);
      cache[n] = result;
      return cache[n];
    }
  };
}
let a = effFunction(getSum);

console.time(); //this function is used to start the timer
console.log(a(3));
console.timeEnd(); //this is used to end teh timer

console.time(); //this function is used to start the timer
console.log(a(3));
console.timeEnd(); //this is used to end teh timer
