from flask import render_template, request, redirect

from flask_app import app

from flask_app.models.users import User


@app.route('/')
def index():
    return redirect('/users')


@app.route('/users')
def users():
    return render_template("users.html",users=User.get_all())


@app.route('/user/new')
def new():
    return render_template("new_user.html")

@app.route('/user/create',methods=['POST'])
def create():
    print(request.form)
    User.save(request.form)
    return redirect('/users')

@app.route('/user/delete/<int:id>')
def delete(id):
    data ={
        'id': id
    } 
    User.delete(data)
    return redirect('/users')

@app.route('/user/show/<int:id>')
def show(id):
    data={
        'id':id
    }
    return render_template('read.html', user=User.get_one(data))


@app.route('/user/edit/<int:id>')
def edit(id):
    data={
        "id":id
    }
    return render_template('edit.html', user=User.get_one(data))

@app.route('/user/update',methods=['POST'])
def update():
    User.update(request.form)
    return redirect('/users')
