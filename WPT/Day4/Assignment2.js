let arr = [10, 20, 30, 40, 50];

function showArray() {
    console.log("Current Array:", arr);
}

function arrayOperations(option, value1, value2) {
    switch (option) {
        case 1:
            arr.push(value1);
            console.log(`After push:`, arr);
            break;

        case 2:
            let popped = arr.pop();
            console.log(`Popped value: ${popped}`);
            showArray();
            break;

        case 3:
            arr.unshift(value1);
            console.log(`After unshift:`, arr);
            break;

        case 4:
            let shifted = arr.shift();
            console.log(`Shifted value: ${shifted}`);
            showArray();
            break;

        case 5:
            let sliced = arr.slice(value1, value2);
            console.log(`Sliced array from ${value1} to ${value2}:`, sliced);
            break;

        case 6:
            let spliced = arr.splice(value1, value2);
            console.log(`Spliced out elements:`, spliced);
            showArray();
            break;

        case 7:
            let index = arr.indexOf(value1);
            console.log(`Index of ${value1}:`, index);
            break;

        case 8:
            let exists = arr.includes(value1);
            console.log(`${value1} exists in array?`, exists);
            break;

        default:
            console.log("Invalid option. Please choose a valid array operation.");
    }
}

// --------- Example Usage ----------- //

console.log("Initial Array:");
showArray();

arrayOperations(1, 60);
arrayOperations(2);
arrayOperations(3, 5);
arrayOperations(4);
arrayOperations(5, 1, 3);
arrayOperations(6, 1, 2); 
arrayOperations(7, 40);
arrayOperations(8, 20);
arrayOperations(9);
