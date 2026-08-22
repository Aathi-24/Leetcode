/**
 * @param {number} n
 * @return {boolean}
 */
var checkDivisibility = function(n) {
    var sum = 0;
    var prod  = 1;
    var num = n;
    while(n > 0){
        var r = n % 10;
        sum += r;
        prod *= r;
        n = Math.floor(n / 10);
    }
    return num % (sum + prod) === 0;
};