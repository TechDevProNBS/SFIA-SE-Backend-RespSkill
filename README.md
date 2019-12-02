# SFIA-SE-Backend-RespSkill
The Backend Microservice used to GET request SFIA information for responsibilities and skills

/getskillsinfo?skillid="GOVN" - from the skills that have been ticked we call a GET request to obtain the criterion of each level required for each skill. The parameters of each get request consist of the 4 letter id (i.e. GOVN) related to each skill. A GET request is called for each skill.
/getresponsibilities - outputs json format listing all the responsibilties and their criterion for each level.
