/*  ✅✅✅
LEET CODE Q 4 EASY MODE --> COUNTER II

Write a function createCounter. It should accept an initial integer init. It should return an object with three functions.

The three functions are:

increment() increases the current value by 1 and then returns it.
decrement() reduces the current value by 1 and then returns it.
reset() sets the current value to init and then returns it.
 

Example 1:

Input: init = 5, calls = ["increment","reset","decrement"]
Output: [6,5,4]
Explanation:
const counter = createCounter(5);
counter.increment(); // 6
counter.reset(); // 5
counter.decrement(); // 4
Example 2:

Input: init = 0, calls = ["increment","increment","decrement","reset","reset"]
Output: [1,2,1,0,0]
Explanation:
const counter = createCounter(0);
counter.increment(); // 1
counter.increment(); // 2
counter.decrement(); // 1
counter.reset(); // 0
counter.reset(); // 0
*/

var createCounter = function (init) {
  let current = init;
  return {
    increment: function () {
      console.log((current = current + 1));
    },
    decrement: function () {
      current = current - 1;
      console.log(current);
    },
    reset: function () {
      current = init;
      console.log(current);
    },
  };
};

const counter = createCounter(0);
counter.increment();
counter.increment();
counter.decrement();
counter.reset();
counter.reset();

console.log("==========");

const counter1 = createCounter(5);
counter1.increment();
counter1.reset();
counter1.decrement();
