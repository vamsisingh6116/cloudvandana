const numbers = [5, 1, 9, 3, 7, 6];

// Sort the array in descending order
numbers.sort(function(a, b) {
    return b - a;
});

console.log("Sorted array in descending order: " + numbers);
