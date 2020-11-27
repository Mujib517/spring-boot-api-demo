FILE="./pid.file"
if [[ -f $FILE ]];then
    kill $(cat $FILE)
fi

