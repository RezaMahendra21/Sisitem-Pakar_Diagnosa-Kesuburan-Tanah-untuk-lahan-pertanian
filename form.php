<h2> Konsultasi Gejala Penyakit</h2><hr>
<?php
  include "lib/koneksi.php";

  	
  
?>

<form action="bayes.php" method="post">
  <table>
  	  <tr>
  	  	 <td>Masukkan Nama </td>
  	  	 <td>:</td>
  	  	 <td><input type="text" name="nama" size="40" maxlength="25" autofocus></td>
  	  </tr>
  </table>
  <hr>

  <table border="0" cellspacing="2" cellpadding="2" width="100%">
     <tr>
     	<td colspan="3" bgcolor="#65a6ff"> Gejala Yang Dialami </td> 
     </tr>

     <?php
       include "lib/koneksi.php";
       $query_gejala = mysqli_query($konek, "select * from tblgejala order by kd_gejala asc ");

       $no=1;

       while ($hasilquery=mysqli_fetch_array($query_gejala)) {
       	if ($no%2==1) {$warna='';} else {$warna='#DDDDDD';}
        echo "<tr bgcolor='$warna'>"; 
        echo "<td colspan='2'> <input type='checkbox' name='daftargejala[]' value='$hasilquery[kd_gejala]'> $hasilquery[kd_gejala] | $hasilquery[nm_gejala]</td>";
        echo "</tr>";
       $no++;
       }    
   
      ?>

  <tr>
  	<td><input type="submit" name="btnkonsul" value="Konsultasi">&nbsp;<input type="reset" name="btnreset" value="Batal"></td>
  </tr>
  </table> 
</form>