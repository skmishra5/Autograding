#!/bin/bash
for a in `ls -1 *.tar`;do
ARCHIVE=$a 
STRIP=${a%.*}
NAME=${STRIP%.tar}
DIRNAME="`echo $NAME |  cut -d '_' -f 1`"
#echo $DIRNAME
mkdir $DIRNAME 
tar -xvf $ARCHIVE -C $DIRNAME 
done
