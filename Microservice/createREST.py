from flask import Flask, request
from flask_restful import Resource, Api

app = Flask(__name__)
api = Api(app)

class Sine(Resource):
    def get(self):
        f=open('sin.txt')
        str=f.read()
        l=str.split(" ")
        return {'radians':l[0],'value':l[-1]}   #JSON format

api.add_resource(Sine, '/sine')

if __name__ == '__main__':
     app.run(port='5002')    #running on Port 5002