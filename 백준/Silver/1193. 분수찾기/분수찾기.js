
const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on("line", function(line) {
  test(line);
  rl.close();
}).on("close", function() {
  process.exit();
});



function test (n){

    let max ;
    let i;


    for( i = 1;  ; i++){

        if(n<= (i*2-1)*i){
            max = i*2 -1;
            i = (i*2-1)*i;
            break; 
        }else if(n<= (i*2*i)+i){
           max = i*2;
           i = (i*2*i)+i ;
           break;
        }
     }
     i = i-n;
     if (max%2 == 0){ //짝수  max 분자  max/1
        console.log((max-i)+'/'+(1+i));
     }else{    //홀수  max 분자    1/max
        console.log((1+i)+'/'+(max-i));
     }

}
