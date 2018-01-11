#!/bin/bash
for a in `ls -1`;do
DIR=$a
if [[ -d "$DIR" ]] 
then 
    cd $DIR
    rm compileResult_$DIR Result_$DIR
    cd ..
fi
done
