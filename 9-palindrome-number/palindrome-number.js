/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let num = x;
    let rev = 0;
    while(num > 0){
        let r = num % 10;
        rev = rev * 10 + r;
        num = Math.floor(num / 10);
    }
    return x === rev;
};