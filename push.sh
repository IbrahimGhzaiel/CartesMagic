#!/bin/sh
git remote add cleverapps
https://$CLEVER_TOKEN:$CLEVER_SECRET@push.clever-cloud.com/app_99082dab-f131-44e5-94bd-821ecb5ba5ab.git
git --verbose --force push cleverapps master