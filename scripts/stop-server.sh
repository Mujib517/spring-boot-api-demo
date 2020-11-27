FILE="./pid.file"
if [[ -f $FILE ]];then
    kill $(cat $FILE) 2>/dev/null
fi

