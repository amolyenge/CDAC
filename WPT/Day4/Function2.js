function doMaths(choice)
{
    function doSquare(x)
    {
        return x*x
    }

   function doPower(a,b)
   {
     let p = Math.pow(a,b)
     return p
   }

   if(choice == 1)
       return doSquare
   else
   {
       return doPower
   }

}


let v = doMaths(1)
let s = v(12) 
console.log(s)


let p =doMaths(2) 
let a = p(4,5)
console.log(a)












