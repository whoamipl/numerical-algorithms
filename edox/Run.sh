#!/bin/bash
for i in {0..100}
do
	printf %s "$i: "
	java Edox $i 
done
