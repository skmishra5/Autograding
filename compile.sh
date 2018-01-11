#!/bin/bash
for a in `ls -1`;do
DIR=$a
if [[ -d "$DIR" ]] 
then 
    cd $DIR
    g++ -Wall bulb.cc >&compileResult_$DIR
    echo $DIR
    ./a.out >> Result_$DIR
    cp compileResult_$DIR ../../HW0CompileResults/.
    cp Result_$DIR ../../HW0Results/.
    cd ..
fi
done
