/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    let res = 0;
    for(i in args){
        res++;
    }
    return res;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */