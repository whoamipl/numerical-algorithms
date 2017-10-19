#!/bin/bash
for i in {-100..100}
do
	printf %s "$i: "
	java Edox $i
done
