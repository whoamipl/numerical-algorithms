#!/bin/bash
echo "Podaj nazwę pliku, w którym chcesz zapisać wyniki: "
read fileName
if [ ! -f ./Edox.class ]; then
	javac Edox.java
fi
java Edox >> $fileName
