function setDisplayTrObject(strFlag, strTrTag)
{
	if (strFlag == 'OFF')
		document.getElementById(strTrTag).style.display = "none";
	else if (strFlag == 'ON')
		document.getElementById(strTrTag).style.display = "table-row";
}