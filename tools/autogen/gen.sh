export CLONE_LOCATION="/tmp/plugin"
rm -rf $CLONE_LOCATION
git clone https://github.com/ChestsPlusPlus/ChestsPlusPlus.git $CLONE_LOCATION

export TAG_PATH="ChestsPlusPlus_Main/src/main/java/com/jamesdpeters/minecraft/chests/filters/ChestsPlusPlusTag.java"
export ITEM_TYPE_PATH="ChestsPlusPlus_Main/src/main/java/com/jamesdpeters/minecraft/chests/filters/ItemTypeUtil.java"

export MATERIALS_PATH="./materials.csv"

python3 main.py
