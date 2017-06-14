var printed = [];
var lastPrint=0;
var proceed = false;
for (i=1; i<=100; i++) {
    (new Promise(
      function (resolve, reject) {
        if(lastPrint == (i-1) || printed.indexOf(lastPrint)>=0){
          proceed = true;
          // lastPrint = i;
          resolve(proceed);
        }
        else{
          proceed = false;
          reject(proceed);
        }
      }
    ))
    .then(
      setTimeout(function(i, proceed) {
        if(i==1){
          console.log(i);
          lastPrint = i;
          printed.push(i);
          // console.log("*printed list:" + printed);
        }
        else if(lastPrint == (i-1) && printed.indexOf(lastPrint)>=0) {
          console.log(i);
          lastPrint = i;
          printed.push(i);
          // console.log("**printed list:" + printed);
        }
        else if(proceed == true) {
          console.log(i);
          lastPrint = i;
          printed.push(i);
          // console.log("***printed list:" + printed);
        }

      }.bind(this, i), Math.random())
    );
}
