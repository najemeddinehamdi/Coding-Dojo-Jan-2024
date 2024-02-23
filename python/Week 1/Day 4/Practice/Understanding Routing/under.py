from flask import Flask 
app = Flask(__name__)  

@app.route('/')         
def hello_world():
    return 'Hello World!' 



@app.route('/dojo')         
def dojo():
    return 'dojo!' 

@app.route('/say/<flaskname>')      
def flask(flaskname):
    return f'hi {flaskname}!'  



@app.route('/repeat/<int:num>/<flaskname>')      
def repeat(num,flaskname):
    return f' {flaskname*num}'



if __name__=="__main__":   
    app.run(debug=True)   


