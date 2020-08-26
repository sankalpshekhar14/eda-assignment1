import requests
import math
#GET Sin
response=requests.get("localhost:5002/sine")
dict_sin=response.json()
sin=float(dict_sin['value'])

#GET Cos
response=requests.get("localhost:8080/eda/")
dict_cos=response.json()
cos=float(dict_cos['value'])

cos_2 = math.pow(cos,2)
sin_2 = math.pow(sin,2)

if(sin_2+cos_2==1):
    print("Hypothesis confirmed")

else:
    print("Error")