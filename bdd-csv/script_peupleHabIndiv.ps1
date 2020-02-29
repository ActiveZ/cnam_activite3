# nom du fichier de sortie
$fSortie = "habitationsIndiv.csv"
$rep = Read-Host 'Nom du fichier de sortie ? (defaut =' $fSortie ') '
if ($rep -ne $null) {$fSortie = $rep}

# séparateur utilisé entre les colonnes
$sep = ","
$rep = Read-Host 'Quel séparateur voulez-vous ? (defaut = ",") '
if ($rep -ne $null) {$sep = $rep}

# nb de ligne
$users = 0
$rep = Read-Host 'Nombre de ligne ? '
if ($rep -gt 0) {$users = $rep}

#----------------------------------------------

# Codes postaux et villes correspondantes
$tabCP = @('75000', '13000', '69000', '31000', '06000',
         '44000', '34000', '67000', '33000', '59000')
$tabVilles = @('Paris', 'Marseille','Lyon','Toulouse','Nice',
        'Nantes', 'Montpellier','Strasbourg', 'Bordeaux', 'Lille')

#-----------------------------------------------

# noms des colonnes
$txt = "nom" + $sep + "adresse" + $sep + "surface" + $sep + "nbPieces" + $sep + "piscine"

# création du fichier CSV avec écrasement de l'ancien
echo $txt > $fSortie 

for ($i = 0; $i -lt $users; $i++) {
    $rnd = Get-Random -Maximum 10 # [0..9]
    $txt = "nom" + $i + $sep + 
            $tabCP[$rnd] + " " + $tabVilles[$rnd] + $sep +
            (Get-Random -Minimum 50 -Maximum 501) + $sep + # surface entre 50 et 500 m²
            (Get-Random -Minimum 1 -Maximum 11) + $sep # entre 1 et 10 pièces
    $piscine = 0        
    if ((Get-Random -Maximum 11) -eq 0) {$piscine = 1} # 1 chance sur 10 d'avoir une piscine
    $txt += $piscine 

# affichage du résultat
echo $txt >> $fSortie
}