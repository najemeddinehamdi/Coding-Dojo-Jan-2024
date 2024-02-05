            var btn=document.getElementById('btn');
            btn.addEventListener('click',function(){
                if (btn.textContent==="login")
                btn.textContent='logout';
                else btn.textContent="login"
            });

            function hide(element){
                element.remove();
            };

            function liked(){
                alert("ninja was liked");
            }