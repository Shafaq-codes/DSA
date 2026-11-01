# Understanding map(), filter(), and reduce() in JavaScript with Real-World Examples

Modern JavaScript heavily encourages functional programming patterns when manipulating arrays. Instead of writing verbose `for` or `while` loops, JavaScript provides three indispensable higher-order array methods: **`map()`**, **`filter()`**, and **`reduce()`**.

In this article, we break down each method with simple explanations, syntax, and practical real-world scenarios.

---

## 1. `map()`: Transforming Every Element

The `map()` method creates a **new array** populated with the results of calling a provided function on every single element in the original array. It does not modify the original array.

### Syntax:
```javascript
const newArray = array.map((element, index, array) => {
  // Return transformed value
});
```

### Real-World Example: Converting Prices with Tax
Imagine an e-commerce cart with item prices that need an 18% GST tax added:

```javascript
const basePrices = [100, 250, 500, 1000];

// Add 18% GST to each price
const pricesWithTax = basePrices.map(price => price * 1.18);

console.log(pricesWithTax);
// Output: [118, 295, 590, 1180]
```

* **Rule of thumb:** If the output array must have the **exact same number of elements** as the input array, use `map()`.

---

## 2. `filter()`: Selecting Specific Elements

The `filter()` method creates a **new array** containing only the elements that pass a test condition implemented by the provided callback function (i.e., where the callback returns `true`).

### Syntax:
```javascript
const filteredArray = array.filter((element, index, array) => {
  // Return true to keep, false to discard
});
```

### Real-World Example: Filtering Active Users
Given a list of users, extract only those whose accounts are active:

```javascript
const users = [
  { id: 1, name: "Alice", isActive: true },
  { id: 2, name: "Bob", isActive: false },
  { id: 3, name: "Charlie", isActive: true }
];

const activeUsers = users.filter(user => user.isActive);

console.log(activeUsers);
// Output: [{ id: 1, name: "Alice", isActive: true }, { id: 3, name: "Charlie", isActive: true }]
```

* **Rule of thumb:** If you want a **subset of elements** that match specific criteria, use `filter()`.

---

## 3. `reduce()`: Boiling Down to a Single Value

The `reduce()` method executes a user-supplied reducer callback function on each element of the array, passing in the return value from the calculation on the preceding element. The final result of running the reducer across all elements is a **single output value** (such as a number, string, or object).

### Syntax:
```javascript
const result = array.reduce((accumulator, currentValue) => {
  // Return updated accumulator
}, initialValue);
```

### Real-World Example: Calculating Shopping Cart Total
Sum up the total price of all items in a cart:

```javascript
const cart = [
  { item: "Laptop Sleeve", price: 600 },
  { item: "Wireless Mouse", price: 1200 },
  { item: "USB Hub", price: 800 }
];

const totalCost = cart.reduce((accumulator, currentItem) => {
  return accumulator + currentItem.price;
}, 0); // 0 is initialValue

console.log(totalCost);
// Output: 2600
```

* **Rule of thumb:** If you want to compute a **single summary value** (sum, average, frequency counter, or flat map), use `reduce()`.

---

## Method Chaining: The Real Power

The true beauty of these methods is that you can chain them together cleanly.

### Example: Finding Total Salary of Engineers
```javascript
const employees = [
  { name: "John", department: "Engineering", salary: 70000 },
  { name: "Sarah", department: "HR", salary: 50000 },
  { name: "Mike", department: "Engineering", salary: 85000 },
  { name: "Emily", department: "Marketing", salary: 60000 }
];

const totalEngineeringPayroll = employees
  .filter(emp => emp.department === "Engineering") // Filter engineers
  .map(emp => emp.salary)                          // Extract salaries
  .reduce((sum, sal) => sum + sal, 0);             // Sum them up

console.log(totalEngineeringPayroll);
// Output: 155000
```

---

## Summary Comparison

| Method | What It Does | Returns | Mutates Original? |
|---|---|---|---|
| **`map()`** | Transforms each element | New array of same length | No |
| **`filter()`** | Selects elements passing a condition | New array of smaller/equal length | No |
| **`reduce()`** | Combines elements into one value | Single value (number, obj, etc.) | No |

---

## Conclusion
Mastering `map()`, `filter()`, and `reduce()` makes your JavaScript code concise, readable, and declarative. They eliminate off-by-one errors and avoid mutation bugs common in traditional loops.
