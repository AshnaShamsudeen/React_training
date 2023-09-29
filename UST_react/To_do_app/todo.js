 async function saveItem(items) {

    let body = {
     method: 'POST',
     body: JSON.stringify(items),
     headers: {
      'Content-type': 'application/json; charset=UTF-8'
     }
    }
    let response = await fetch('http://localhost:3500/tasks', body
    )
    if (response.status === 201) {
     let data = await response.json()
     console.log(data)
     return Promise.resolve(data);
    }
    else {
     console.log(response)
     return Promise.reject({
      message: `Error ${response.status}`
     })
    }
   }
   async function getAllTasks() {
    let response = await fetch('http://localhost:3500/tasks')
    if (response.status === 200) {
     let data = await response.json()
     console.log(data);
     return Promise.resolve(data);
    }
    else {
     console.log(response);
     return Promise.reject({
      message: `Error ${response.status}`
     });
    }
   }
      