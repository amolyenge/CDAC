function getMax(...a) {

    let max = a[0]
    for(let i = 0; i < a.length; i++){
        max = Math.max(max , a[i])
    }

    console.log("Max Number is: " + max);

}

getMax(1,2,3,4,5,6,7,8,9)
getMax(23,24,25,26,37,100)
getMax(21,34,65,78,98,98,45,113)