
function focuspwd()
  {
  this.form1.pwd1.focus();
  }
  function modpwd()
  {
  if(this.form1.pwd1.value=="")
  {
  window.alert("�����������");
  form1.pwd1.focus();
  return false;
  
  }
  
    if(this.form1.pwd2.value=="")
  {
   window.alert("�������������");
  form1.pwd2.focus();
  return false;
  
  }
    if(this.form1.password.value=="")
  {
   window.alert(" ���ٴ��������������");
  form1.password.focus();
  return false;
  
  }
    if(this.form1.pwd2.value!=this.form1.password.value)
    {
     window.alert("�������벻һ��");
    form1.pwd2.focus();
    return false;
    
    }
    }
